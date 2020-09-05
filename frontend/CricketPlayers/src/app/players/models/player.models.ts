export class BaseEntity{
    id: number;
}
export class Player extends BaseEntity {
    name: string;
    playerCode: string;
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
