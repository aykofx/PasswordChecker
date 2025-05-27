# 🔐 Password Checker (Java)

A small Java program that checks whether a password is strong enough.

## ✅ Features

The program checks the following password requirements:
- Minimum length of 8 characters
- Contains at least one digit (`0–9`)
- Contains at least one uppercase letter (`A–Z`)
- Contains at least one special character (e.g. `!`, `@`, `#`, `$`)

If one or more rules are not met, the program gives feedback to the user.

It keeps asking for a password until a strong one is entered.

## ▶️ Example Output

Enter your password: hallo123
Your password must contain at least one uppercase letter
Your password must contain at least one special character

Enter your password: Hallo123!
Hallo123! is a very secure password.
