/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkBadgeDefinitionChangeEvent extends SObject {
	public static SObjectType$<WorkBadgeDefinitionChangeEvent> SObjectType;
	public static SObjectFields$<WorkBadgeDefinitionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer GivenBadgeCount;
	public Id Id;
	public String ImageUrl;
	public Boolean IsActive;
	public Boolean IsCompanyWide;
	public Boolean IsLimitPerUser;
	public Boolean IsRewardBadge;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LimitNumber;
	public Date LimitStartDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public WorkBadgeDefinitionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinitionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
