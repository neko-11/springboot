package cn.intellifai.entity;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
public class Team {
    private int id;
    private String team;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", amount=" + amount +
                '}';
    }
}
