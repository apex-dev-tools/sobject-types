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
public class LoyaltyMembershipLifecycleHistory extends SObject {
	public static SObjectType$<LoyaltyMembershipLifecycleHistory> SObjectType;
	public static SObjectFields$<LoyaltyMembershipLifecycleHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LoyaltyMembershipLifecycleId;
	public LoyaltyMembershipLifecycle LoyaltyMembershipLifecycle;
	public Object NewValue;
	public Object OldValue;

	public LoyaltyMembershipLifecycleHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMembershipLifecycleHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMembershipLifecycleHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMembershipLifecycleHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMembershipLifecycleHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
