package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zhang.chat.bean.chat.Verification;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VERIFICATION".
*/
public class VerificationDao extends AbstractDao<Verification, Long> {

    public static final String TABLENAME = "VERIFICATION";

    /**
     * Properties of entity Verification.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property M_id = new Property(0, long.class, "m_id", true, "_id");
        public final static Property User_friend_id = new Property(1, long.class, "user_friend_id", false, "USER_FRIEND_ID");
        public final static Property Friend_user_id = new Property(2, long.class, "friend_user_id", false, "FRIEND_USER_ID");
        public final static Property M_state = new Property(3, int.class, "m_state", false, "M_STATE");
        public final static Property Message = new Property(4, String.class, "message", false, "MESSAGE");
        public final static Property IsRead = new Property(5, boolean.class, "isRead", false, "IS_READ");
        public final static Property Friend_name = new Property(6, String.class, "friend_name", false, "FRIEND_NAME");
        public final static Property Friend_img_face = new Property(7, String.class, "friend_img_face", false, "FRIEND_IMG_FACE");
    }


    public VerificationDao(DaoConfig config) {
        super(config);
    }
    
    public VerificationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VERIFICATION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: m_id
                "\"USER_FRIEND_ID\" INTEGER NOT NULL ," + // 1: user_friend_id
                "\"FRIEND_USER_ID\" INTEGER NOT NULL ," + // 2: friend_user_id
                "\"M_STATE\" INTEGER NOT NULL ," + // 3: m_state
                "\"MESSAGE\" TEXT," + // 4: message
                "\"IS_READ\" INTEGER NOT NULL ," + // 5: isRead
                "\"FRIEND_NAME\" TEXT," + // 6: friend_name
                "\"FRIEND_IMG_FACE\" TEXT);"); // 7: friend_img_face
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VERIFICATION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Verification entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getM_id());
        stmt.bindLong(2, entity.getUser_friend_id());
        stmt.bindLong(3, entity.getFriend_user_id());
        stmt.bindLong(4, entity.getM_state());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(5, message);
        }
        stmt.bindLong(6, entity.getIsRead() ? 1L: 0L);
 
        String friend_name = entity.getFriend_name();
        if (friend_name != null) {
            stmt.bindString(7, friend_name);
        }
 
        String friend_img_face = entity.getFriend_img_face();
        if (friend_img_face != null) {
            stmt.bindString(8, friend_img_face);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Verification entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getM_id());
        stmt.bindLong(2, entity.getUser_friend_id());
        stmt.bindLong(3, entity.getFriend_user_id());
        stmt.bindLong(4, entity.getM_state());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(5, message);
        }
        stmt.bindLong(6, entity.getIsRead() ? 1L: 0L);
 
        String friend_name = entity.getFriend_name();
        if (friend_name != null) {
            stmt.bindString(7, friend_name);
        }
 
        String friend_img_face = entity.getFriend_img_face();
        if (friend_img_face != null) {
            stmt.bindString(8, friend_img_face);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Verification readEntity(Cursor cursor, int offset) {
        Verification entity = new Verification( //
            cursor.getLong(offset + 0), // m_id
            cursor.getLong(offset + 1), // user_friend_id
            cursor.getLong(offset + 2), // friend_user_id
            cursor.getInt(offset + 3), // m_state
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // message
            cursor.getShort(offset + 5) != 0, // isRead
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // friend_name
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // friend_img_face
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Verification entity, int offset) {
        entity.setM_id(cursor.getLong(offset + 0));
        entity.setUser_friend_id(cursor.getLong(offset + 1));
        entity.setFriend_user_id(cursor.getLong(offset + 2));
        entity.setM_state(cursor.getInt(offset + 3));
        entity.setMessage(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsRead(cursor.getShort(offset + 5) != 0);
        entity.setFriend_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFriend_img_face(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Verification entity, long rowId) {
        entity.setM_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Verification entity) {
        if(entity != null) {
            return entity.getM_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Verification entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}