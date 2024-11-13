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
public class LoyaltyPgmMbrAttributeValChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmMbrAttributeValChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmMbrAttributeValChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CumulativeValue;
	public String CurrencyIsoCode;
	public String CurrentValue;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LastResetDate;
	public Id LoyaltyPgmEngmtAttributeId;
	public LoyaltyPgmEngmtAttribute LoyaltyPgmEngmtAttribute;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public String ReplayId;
	public Integer ResetCount;
	public Date StartDate;

	public LoyaltyPgmMbrAttributeValChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrAttributeValChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrAttributeValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrAttributeValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrAttributeValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
