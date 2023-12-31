package com.blood_bank_system.tables;



public class inventory {
    private String inventoryId;
    private String bloodBankId;
    private String groupId;
    private String bloodGroup;
    private String availableUnits;
    private String lastUpdatedDate;
    private String storageLocation;
    private String editor;

    public inventory(String inventoryId, String bloodBankId, String groupId, String bloodGroup, String availableUnits, String lastUpdatedDate, String storageLocation,String editor) {
        this.inventoryId = inventoryId;
        this.bloodBankId = bloodBankId;
        this.groupId = groupId;
        this.bloodGroup = bloodGroup;
        this.availableUnits = availableUnits;
        this.lastUpdatedDate = lastUpdatedDate;
        this.storageLocation = storageLocation;
        this.editor=editor;
    }
    
    public inventory( String bloodBankId, String groupId, String bloodGroup, String availableUnits, String lastUpdatedDate, String storageLocation, String editor) {
//        this.inventoryId = inventoryId;
        this.bloodBankId = bloodBankId;
        this.groupId = groupId;
        this.bloodGroup = bloodGroup;
        this.availableUnits = availableUnits;
        this.lastUpdatedDate = lastUpdatedDate;
        this.storageLocation = storageLocation;
        this.editor=editor;
    }

    public inventory() {
		// TODO Auto-generated constructor stub
	}

	public inventory(int inventoryId, String bloodBankId, String groupId, String groupName, String availableUnits,
			String lastUpdatedDate, String storageLocation) {
		// TODO Auto-generated constructor stub
		this.bloodBankId = bloodBankId;
        this.groupId = groupId;
//        this.bloodGroup = bloodGroup;
        this.availableUnits = availableUnits;
        this.lastUpdatedDate = lastUpdatedDate;
        this.storageLocation = storageLocation;
	}

	public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(String bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(String string) {
    	if(string==null) {
    		string="0";
    	}
        this.availableUnits = string;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
}


