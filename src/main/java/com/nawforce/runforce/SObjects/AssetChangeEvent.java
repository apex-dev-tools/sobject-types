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
public class AssetChangeEvent extends SObject {
	public static SObjectType$<AssetChangeEvent> SObjectType;
	public static SObjectFields$<AssetChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public Id AssetProvidedById;
	public Account AssetProvidedBy;
	public Id AssetServicedById;
	public Account AssetServicedBy;
	public Decimal AverageUptimePerDay;
	public Object ChangeEventHeader;
	public String City;
	public String ConsequenceOfFailure;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentAmount;
	public Datetime CurrentLifecycleEndDate;
	public Decimal CurrentMrr;
	public Decimal CurrentQuantity;
	public String Description;
	public String DigitalAssetStatus;
	public String Division;
	public String ExternalIdentifier;
	public String GeocodeAccuracy;
	public Boolean HasLifecycleManagement;
	public Id Id;
	public Date InstallDate;
	public Boolean IsCompetitorProduct;
	public Boolean IsInternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Datetime LifecycleEndDate;
	public Datetime LifecycleStartDate;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Date ManufactureDate;
	public Decimal MeanTimeBetweenFailures;
	public Decimal MeanTimeToRepair;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Asset Parent;
	public String PostalCode;
	public Decimal Price;
	public Id Product2Id;
	public Product2 Product2;
	public Date PurchaseDate;
	public Decimal Quantity;
	public String ReplayId;
	public Id RootAssetId;
	public Asset RootAsset;
	public String SerialNumber;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusReason;
	public String Street;
	public Decimal SumDowntime;
	public Decimal SumUnplannedDowntime;
	public Decimal TotalLifecycleAmount;
	public Datetime UptimeRecordEnd;
	public Datetime UptimeRecordStart;
	public Date UsageEndDate;
	public String Uuid;

	public AssetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
