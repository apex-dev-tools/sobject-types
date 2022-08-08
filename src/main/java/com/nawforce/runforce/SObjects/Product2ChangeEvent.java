/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Product2ChangeEvent extends SObject {
	public static SObjectType$<Product2ChangeEvent> SObjectType;
	public static SObjectFields$<Product2ChangeEvent> Fields;

	public com.nawforce.runforce.System.Boolean CanUseQuantitySchedule;
	public com.nawforce.runforce.System.Boolean CanUseRevenueSchedule;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DisplayUrl;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public com.nawforce.runforce.System.String ExternalId;
	public com.nawforce.runforce.System.String Family;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsArchived;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfQuantityInstallments;
	public com.nawforce.runforce.System.Integer NumberOfRevenueInstallments;
	public com.nawforce.runforce.System.String ProductCode;
	public com.nawforce.runforce.System.String QuantityInstallmentPeriod;
	public com.nawforce.runforce.System.String QuantityScheduleType;
	public com.nawforce.runforce.System.String QuantityUnitOfMeasure;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String RevenueInstallmentPeriod;
	public com.nawforce.runforce.System.String RevenueScheduleType;
	public com.nawforce.runforce.System.String StockKeepingUnit;

	public Product2ChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Product2ChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
