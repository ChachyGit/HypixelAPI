package me.chachy.legendapi;

public enum Game {
    KIT_PVP("KitPVP", "Kit", 2);

    private static final Game[] VALUES = values();

    private final String name, dbName;
    private final int id;

    Game(String name, String dbName, int id) {
        this.name = name;
        this.dbName = dbName;
        this.id = id;
    }
    
    public static Game fromId(int id) {
        for (Game gameType : VALUES) {
            if (gameType.id == id) {
                return gameType;
            }
        }
        return null;
    }

    public static Game fromDatabase(String dbName) {
        for (Game gameType : VALUES) {
            if (gameType.dbName.equals(dbName)) {
                return gameType;
            }
        }
        return null;
    }

    public static Game[] getValues() {
        return VALUES;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDbName() {
        return dbName;
    }
}
