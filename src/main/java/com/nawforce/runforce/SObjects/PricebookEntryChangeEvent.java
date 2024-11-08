/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PricebookEntryChangeEvent extends SObject {
	public static SObjectType$<PricebookEntryChangeEvent> SObjectType;
	public static SObjectFields$<PricebookEntryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsDerived;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public String ReplayId;
	public Decimal UnitPrice;
	public Boolean UseStandardPrice;

	public PricebookEntryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
