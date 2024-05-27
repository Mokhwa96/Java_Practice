package Object_Oriented_Programming_Advanced.polymorphism;

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend();
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new GirlFriend();

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}

class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }
}