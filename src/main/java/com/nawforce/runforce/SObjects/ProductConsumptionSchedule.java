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
public class ProductConsumptionSchedule extends SObject {
	public static SObjectType$<ProductConsumptionSchedule> SObjectType;
	public static SObjectFields$<ProductConsumptionSchedule> Fields;

	public Id ConsumptionScheduleId;
	public ConsumptionSchedule ConsumptionSchedule;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProductId;
	public Product2 Product;
	public Datetime SystemModstamp;

	public ProductConsumptionSchedule clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumptionSchedule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
