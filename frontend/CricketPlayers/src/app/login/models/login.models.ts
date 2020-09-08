import { BaseEntity } from 'src/app/players/models/player.models';

export class User extends BaseEntity {
    username: string;
    password: string;
}

export class Registration extends BaseEntity {
    password: string;
    fName: string;
    lName: string;
    emailId: string;
    mobileNumber: any;
}