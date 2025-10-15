/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FulfillmentLineRel extends SObject {
	public static SObjectType$<FulfillmentLineRel> SObjectType;
	public static SObjectFields$<FulfillmentLineRel> Fields;

	public String AssociatedFoItemInventory;
	public Id AssociatedFulfillOrderItemId;
	public FulfillmentOrderLineItem AssociatedFulfillOrderItem;
	public String AssociatedLineRole;
	public String AssociatedQuanScaleMethod;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MainFulfillOrderItemRole;
	public Id MainFulfillmentOrderItemId;
	public FulfillmentOrderLineItem MainFulfillmentOrderItem;
	public String Name;
	public Id ProductRelationshipTypeId;
	public ProductRelationshipType ProductRelationshipType;
	public Datetime SystemModstamp;

	public FulfillmentLineRel clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentLineRel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentLineRel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentLineRel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentLineRel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
