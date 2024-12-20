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
public class LoyaltyPgmEngmtAttributeChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmEngmtAttributeChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmEngmtAttributeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Integer MaximumResetCountPerPeriod;
	public String Name;
	public String ReplayId;
	public String ResetValueOn;
	public Boolean ShouldOverwriteAttrCurrVal;
	public Date StartDate;
	public String Status;
	public String TargetValue;
	public String ValueResetFrequency;

	public LoyaltyPgmEngmtAttributeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
