import axios from "axios";

export default axios.create({
    baseURL:'https://653b-115-73-216-91.ngrok-free.app',
    headers:{"ngrok-skip-browser-warning":"true"}
});