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
public class LoyaltyProgramBadgeChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramBadgeChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramBadgeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String ImageUrl;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public String ReplayId;
	public Date StartDate;
	public String Status;
	public Integer ValidityDuration;
	public String ValidityDurationUnit;
	public Date ValidityEndDate;
	public String ValidityType;

	public LoyaltyProgramBadgeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramBadgeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramBadgeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramBadgeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramBadgeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
