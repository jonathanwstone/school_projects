
def emailtracker():

    emaillist = []
    runemaillist = True
    while runemaillist == True:
        print("[Mailing List]")
        print(" ")
        print("1 - Add email")
        print("2- Delete email")
        print("3- List all emails")
        print("4 - Quit")
        user_request = input("Make your selection: ")

        match user_request:
            case "1":
                add_email = input("Enter the email to be added: ")
                print("Email added to mailing list.")
                emaillist.append(add_email)
            case "2":
                del_email = input("Enter the email to be removed: ")
                if del_email in emaillist:
                    emaillist.remove(del_email)
                else:
                    print("No such email found in mailing list:", del_email)
            case "3":
                print(emaillist)
            case "4":
                print("Shutting down...")
                runemaillist = False

emailtracker()