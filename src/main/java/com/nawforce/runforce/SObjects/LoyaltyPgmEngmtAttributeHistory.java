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
public class LoyaltyPgmEngmtAttributeHistory extends SObject {
	public static SObjectType$<LoyaltyPgmEngmtAttributeHistory> SObjectType;
	public static SObjectFields$<LoyaltyPgmEngmtAttributeHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LoyaltyPgmEngmtAttributeId;
	public LoyaltyPgmEngmtAttribute LoyaltyPgmEngmtAttribute;
	public Object NewValue;
	public Object OldValue;

	public LoyaltyPgmEngmtAttributeHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttributeHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
