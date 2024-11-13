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
public class GroupClassChangeEvent extends SObject {
	public static SObjectType$<GroupClassChangeEvent> SObjectType;
	public static SObjectFields$<GroupClassChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String Category;
	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Date EffectiveEndDate;
	public Date EffectiveStartDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentGroupClassId;
	public GroupClass ParentGroupClass;
	public String ReplayId;
	public String UsageType;

	public GroupClassChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupClassChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
