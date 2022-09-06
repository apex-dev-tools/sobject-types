/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OrderShare extends SObject {
	public static SObjectType$<OrderShare> SObjectType;
	public static SObjectFields$<OrderShare> Fields;

	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OrderAccessLevel;
	public Id OrderId;
	public Order Order;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public OrderShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrderShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrderShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrderShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrderShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
