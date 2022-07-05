export class Users {
    id!: number;
    firstName!: string;
    lastName!: string;
    userName!: string;
    password!:string;
    userRole!: Role;
    email!: string;
    address!: string;
    aboutMe!: string;

}
export enum Role {
    Contractor,
    Customer}