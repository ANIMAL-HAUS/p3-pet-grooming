export class Users{
    id!: number;
    firstName!:String;
    lastName!:String;
    userName!:String;
    password!:String;
    userEnum!:Role;
    email!:String;
    address!:String;
    aboutMe!:String;

}
export enum Role {
    Contractor,
    Customer}