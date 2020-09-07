export class BaseEntity{
    id: number;
}

export class Address extends BaseEntity {
    addressLine1: string;
    addressLine2: string;
    state: string;
    country: string;
    city: string;
    postalCode: number;
}

export class Inning extends BaseEntity {
    runs: number;
    fours: number;
    sixes: number;
    wickets: number;
    overs: number;
    notOut: boolean;
    date: any;
    place: string;
    match: string;
}
export class Player extends BaseEntity {
    fName: string;
    lName: string;
    birthDate: any;
    joiningDate: any;
    emailId: string;
    mobileNumber: any;
    playerCode: string;
    address: Address;
    innings: Inning[] = [];
    constructor() {
        super();
        this.address = new Address();
        this.innings = new Array<Inning>();
    }
}


