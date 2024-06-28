/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Product2ChangeEvent extends SObject {
	public static SObjectType$<Product2ChangeEvent> SObjectType;
	public static SObjectFields$<Product2ChangeEvent> Fields;

	public Boolean CanUseQuantitySchedule;
	public Boolean CanUseRevenueSchedule;
	public Datetime AvailabilityDate;
	public Id BasedOnId;
	public ProductClassification BasedOn;
	public Object ChangeEventHeader;
	public String ConfigureDuringSale;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DiscontinuedDate;
	public String DisplayUrl;
	public Datetime EndOfLifeDate;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public String ExternalId;
	public String Family;
	public String HelpText;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsAssetizable;
	public Boolean IsSerialized;
	public Boolean IsSoldOnlyWithOtherProds;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumberOfQuantityInstallments;
	public Integer NumberOfRevenueInstallments;
	public String ProductClass;
	public String ProductCode;
	public String QuantityInstallmentPeriod;
	public String QuantityScheduleType;
	public String QuantityUnitOfMeasure;
	public String ReplayId;
	public String RevenueInstallmentPeriod;
	public String RevenueScheduleType;
	public Id SellerId;
	public Seller Seller;
	public Id SourceProductId;
	public Product2 SourceProduct;
	public String StockKeepingUnit;
	public String TransferRecordMode;
	public String Type;

	public Product2ChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
