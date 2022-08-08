import java.util.Scanner;

class SavingsAccount extends BankAccount {

  int minBal = 2000;
  String type = "Savings Account";

  void getMinimumBalance() {
    // check the type of account to access min balance
    System.out.println(
      "Minimum balance for your account is INR " + this.minBal
    );
 
  }

  void getDetails() {
    System.out.println("=========== ACCOUNT DETAILS ===========");
    System.out.println("Account type:   " + this.type);
    System.out.println("Account balance:   " + this.bal);
    System.out.println("Minimum balance:   " + this.minBal);
    System.out.println("Linked UID:   " + this.UID);
    System.out.println("Linked PAN:   " + this.PAN);
 
  }
}

class CurrentAccount extends BankAccount {

  int minBal = 10000;
  String type = "Current Account";

  void getMinimumBalance() {
    // check the type of account to access min balance
    System.out.println(
      "Minimum balance for your account is INR " + this.minBal
    );
 
  }

  void getDetails() {
    System.out.println("=========== ACCOUNT DETAILS ===========");
    System.out.println("Account type:      " + this.type);
    System.out.println("Account balance:   " + this.bal);
    System.out.println("Minimum balance:   " + this.minBal);
    System.out.println("Linked UID:        " + this.UID);
    System.out.println("Linked PAN:        " + this.PAN);
 
  }
}

class BankAccount {

  String UID = " ";
  String PAN = " ";
  String PIN = "0000";
  Scanner input = new Scanner(System.in);
  int bal;

  void setPIN() {
    System.out.print("Enter your current PIN: ");
    String pin = input.next();
    if (pin.equals(this.PIN)) {
      System.out.print("Enter your new PIN: ");
      String newPin = input.next();
      if (newPin.length() == 4) {
        this.PIN = newPin;
        System.out.println("Your PIN has been updated successfully.");
      } else {
        System.out.println("Please enter a valid 4-digit PIN and try again.");
        this.setPIN();
      }
    } else {
      System.out.println(
        "The PIN you entered is not correct. Please check and try again."
      );
    }
 
  }

  void depositMoney() {
    // check denominations and add to object balance
    System.out.println("Please enter your denominations below:");
    System.out.print("INR 2000:    ");
    int twoThousandBill = input.nextInt();
    System.out.print("INR 500:    ");
    int fiveHundredBill = input.nextInt();
    System.out.print("INR 200:    ");
    int twoHundredBill = input.nextInt();
    System.out.print("INR 100:    ");
    int hundredBill = input.nextInt();
    int totalAmount =
      (2000 * twoThousandBill) +
      (500 * fiveHundredBill) +
      (200 * twoHundredBill) +
      (100 * hundredBill);
    System.out.print(
      "Please confirm if you want to deposit INR " +
      totalAmount +
      " to your bank account. (Y/N): "
    );
    char confirmation = input.next().charAt(0);
    switch (confirmation) {
      case 'Y':
        this.bal = this.bal + totalAmount;
        System.out.println(
          "INR " + totalAmount + " succesfully deposited to your account."
        );
        break;
      case 'N':
        System.out.println("Please re-enter the correct information:");
        this.depositMoney();
    }
    System.out.println("Your Account Balance is INR " + this.bal);
 
  }

  void withdrawMoney() {
    // check balance and subtract from object balance
    System.out.print("Enter the amount of money you want to withdraw: INR ");
    int cash = input.nextInt();
    System.out.print("Enter your PIN: ");
    String pin = input.next();
    if (pin.equals(this.PIN)) {
      if (cash < this.bal && cash % 100 == 0) {
        this.bal = this.bal - cash;
        System.out.println(
          "INR " + cash + " succesfully withdrawn from your account."
        );
      } else if (cash < this.bal && cash % 100 != 0) {
        System.out.println(
          "Please enter an amount in multiples of 100 and try again: "
        );
        this.withdrawMoney();
      } else {
        System.out.println("Insufficient balance.");
      }
    } else {
      System.out.print(
        "The PIN you entered is not correct. Please check and try again."
      );
      this.withdrawMoney();
    }

    System.out.println("Your Account Balance is INR " + this.bal);
 
  }

  void transferMoney(BankAccount beneficiary) {
    // subtract from this object and add to paramater object balance
    System.out.print("Enter the amount of money you want to transfer: INR ");
    int amount = input.nextInt();
    System.out.print(
      "Are you sure you want to transfer INR " + amount + "? (Y/N): "
    );
    char confirmation = input.next().charAt(0);
    System.out.print("Enter your PIN: ");
    String pin = input.next();
    if (pin.equals(this.PIN)) {
      switch (confirmation) {
        case 'Y':
          if (amount < this.bal) {
            this.bal = this.bal - amount;
            beneficiary.bal = beneficiary.bal + amount;
            System.out.println(
              "INR " +
              amount +
              " succesfully transferred from your account to the beneficiary."
            );
          } else {
            System.out.println("Insufficient balance.");
          }
          break;
        case 'N':
          System.out.println("Please enter the correct amount and try again:");
          this.transferMoney(beneficiary);
      }
    } else {
      System.out.print(
        "The PIN you entered is not correct. Please check and try again."
      );
      this.transferMoney(beneficiary);
    }
    System.out.println("Your Account Balance is INR " + this.bal);
 
  }

  void checkUID() {
    // check if their aadhaar is updated
    if (this.UID.equals(" ")) {
      System.out.println(
        "You Aadhaar is not linked with your bank account. Please enter your Aadhaar number to proceed: "
      );
      String aadhaar = input.next();
      if (aadhaar.length() == 12) {
        this.UID = aadhaar;
        System.out.println(
          "Your Aadhaar is linked with your bank account successfully."
        );
      } else {
        System.out.println(
          "Please enter a valid 12-digit Aadhaar number and try again."
        );
        this.checkUID();
      }
    } else {
      System.out.println(
        "Your bank account is linked with the Aadhaar number: " + this.UID
      );
    }
 
  }

  void checkPAN() {
    // check if their pan is updated
    if (this.PAN.equals(" ")) {
      System.out.println(
        "You PAN is not linked with your bank account. Please enter your PAN to proceed: "
      );
      String pan = input.next();
      if (pan.length() == 10) {
        this.PAN = pan;
        System.out.println(
          "Your PAN is linked with your bank account successfully."
        );
      } else {
        System.out.println(
          "Please enter a valid 10-character PAN and try again."
        );
        this.checkPAN();
      }
    } else {
      System.out.println(
        "Your bank account is linked with the PAN: " + this.PAN
      );
    }
  }

  void getMinimumBalance() {
    // check the type of account to access min balance
  }

  void getDetails() {
    // println all object details
  }

  void getTransactions() {
    // println last 5 transactions
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    SavingsAccount Account1 = new SavingsAccount();
    SavingsAccount Account2 = new SavingsAccount();

    System.out.println("Select your account:");
    System.out.println("1. Account1");
    System.out.println("2. Account2");
    int selectedAccount = input.nextInt();
    BankAccount account = null;
    int flag = 0;
    String pin;
    switch (selectedAccount) {
      case 1:
        System.out.print("Enter your current PIN: ");
        pin = input.next();
        if (pin.equals(Account1.PIN)) {
          account = Account1;
          flag = 1;
        } else {
          System.out.print(
            "The PIN you entered is incorrect. Please check and try again."
          );
        }
        break;
      case 2:
        System.out.print("Enter your current PIN: ");
        pin = input.next();
        if (pin.equals(Account2.PIN)) {
          account = Account2;
          flag = 1;
        } else {
          System.out.print(
            "The PIN you entered is incorrect. Please check and try again."
          );
        }
        break;
    }

    while (flag == 1) {
      System.out.println(
        "--------------------------------------------------------------"
      );
      System.out.println("Select the action you want to perform:");
      System.out.println("1. Set PIN");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Transfer Money");
      System.out.println("5. Check/Set UID");
      System.out.println("6. Check/Set PAN");
      System.out.println("7. Check Minimum Balance");
      System.out.println("8. Account Details");
      System.out.println("9. Exit");
      int selectedAction = input.nextInt();
      System.out.println(
        "--------------------------------------------------------------"
      );
      switch (selectedAction) {
        case 1:
          account.setPIN();
          break;
        case 2:
          account.depositMoney();
          break;
        case 3:
          account.withdrawMoney();
          break;
        case 4:
          System.out.println("Select the account you want transfer money to:");
          System.out.println("1. Account1");
          System.out.println("2. Account2");
          int beneficiaryAccount = input.nextInt();
          SavingsAccount beneficiary = null;
          switch (beneficiaryAccount) {
            case 1:
              beneficiary = Account1;
              break;
            case 2:
              beneficiary = Account2;
              break;
          }
          account.transferMoney(beneficiary);
          break;
        case 5:
          account.checkUID();
          break;
        case 6:
          account.checkPAN();
          break;
        case 7:
          account.getMinimumBalance();
          break;
        case 8:
          account.getDetails();
          break;
        case 9:
          flag = 0;
          break;
      }
    }

    input.close();
  }
}
