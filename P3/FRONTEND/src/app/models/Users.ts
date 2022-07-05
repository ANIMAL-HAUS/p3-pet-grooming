export class Users {
    id!: number;
    firstName!: string;
    lastName!: string;
    userName!: string;
    password!:string;
    userRole!: Role;
    email!: string;
    address!: string;
    aboutme!: string;

}
export enum Role {
    Contractor,
    Customer}
