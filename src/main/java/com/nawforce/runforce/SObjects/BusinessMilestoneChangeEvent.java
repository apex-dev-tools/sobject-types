/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BusinessMilestoneChangeEvent extends SObject {
	public static SObjectType$<BusinessMilestoneChangeEvent> SObjectType;
	public static SObjectFields$<BusinessMilestoneChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime ExpirationDate;
	public String ExpirationDescription;
	public Id Id;
	public Boolean IsExpired;
	public Boolean IsTentative;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime MilestoneDate;
	public String MilestoneDescription;
	public Id MilestoneSiteId;
	public Location MilestoneSite;
	public String MilestoneType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PrimaryAccountId;
	public Account PrimaryAccount;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public BusinessMilestoneChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessMilestoneChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessMilestoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessMilestoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessMilestoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
