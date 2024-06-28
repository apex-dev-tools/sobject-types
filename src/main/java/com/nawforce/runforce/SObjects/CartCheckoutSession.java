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
public class CartCheckoutSession extends SObject {
	public static SObjectType$<CartCheckoutSession> SObjectType;
	public static SObjectFields$<CartCheckoutSession> Fields;

	public Id BackgroundOperationId;
	public BackgroundOperation BackgroundOperation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsError;
	public Boolean IsProcessing;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NextState;
	public Id OrderId;
	public Order Order;
	public String OrderReferenceNumber;
	public String State;
	public Datetime SystemModstamp;
	public Id WebCartId;
	public WebCart WebCart;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CartCheckoutSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartCheckoutSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartCheckoutSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartCheckoutSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartCheckoutSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
