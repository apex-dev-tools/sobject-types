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
public class LoyaltyPgmEngmtAttrPromChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmEngmtAttrPromChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmEngmtAttrPromChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramEngmtAttrId;
	public LoyaltyPgmEngmtAttribute LoyaltyProgramEngmtAttr;
	public String Name;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;

	public LoyaltyPgmEngmtAttrPromChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttrPromChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttrPromChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttrPromChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttrPromChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
