export class Event {
    public id: number;
    public name: string;
    public description: string;
    public imageID: number;

    constructor(id:number, name:string, description: string, imageID: number){
        this.id=id;
        this.name=name;
        this.description=description;
        this.imageID=imageID;
    }

}