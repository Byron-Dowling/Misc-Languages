pragma solidity ^0.5.1;

contract MyContract
{
    mapping(uint => Customer) public customers;
    uint256 customer_count;
    uint256 contractOpenTime = 1648573946;
    uint256 chainStartTime; 

    address owner;

    modifier onlyOwner()
    {
        require(msg.sender == owner);
        _;
    }

    modifier onlyWhileOpen()
    {
        require(chainStartTime >= contractOpenTime);
        _;
    }

    struct Customer
    {
        uint _id;
        string _fname;
        string _lname;
    }

    function incrementCount() internal
    {
        customer_count += 1;
    }

    function addPerson(string memory _fname, string memory _lname) public
    {
        incrementCount();
        customers[customer_count] = Customer(customer_count, _fname, _lname);
    }

    enum State {Waiting, Ready, Active}
    State public state;

    constructor() public
    {
        state = State.Waiting;
        owner = msg.sender;
        chainStartTime = now;
    }

    function activate() public
    {
        state = State.Active;
    }

    function isActive() public view returns(bool)
    {
        return state == State.Active;
    }
}
