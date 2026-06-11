/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContractLineItemChangeEvent extends SObject {
	public static SObjectType$<ContractLineItemChangeEvent> SObjectType;
	public static SObjectFields$<ContractLineItemChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LineItemNumber;
	public Id LocationId;
	public Location Location;
	public Id ParentContractLineItemId;
	public ContractLineItem ParentContractLineItem;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Decimal Quantity;
	public String ReplayId;
	public Id RootContractLineItemId;
	public ContractLineItem RootContractLineItem;
	public Id ServiceContractId;
	public ServiceContract ServiceContract;
	public Date StartDate;
	public Decimal UnitPrice;

	public ContractLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
