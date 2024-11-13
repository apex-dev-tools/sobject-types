/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CustomerPropertyChangeEvent extends SObject {
	public static SObjectType$<CustomerPropertyChangeEvent> SObjectType;
	public static SObjectFields$<CustomerPropertyChangeEvent> Fields;

	public Address Address;
	public Integer AnnualMileage;
	public Id AssetId;
	public Asset Asset;
	public Decimal BathroomCount;
	public Decimal BedroomCount;
	public String BuiltUpArea;
	public String CeilingType;
	public Object ChangeEventHeader;
	public String City;
	public String ConstructionClass;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DaysDrivenTowork;
	public String Description;
	public String Division;
	public String DwellingType;
	public Integer EngineDisplacementVolume;
	public Decimal FactoryPrice;
	public Decimal FairMarketValue;
	public String FinancingType;
	public Integer FloorCount;
	public String FloorType;
	public String FoundationType;
	public String FuelType;
	public Integer GarageSpaceCount;
	public String GarageType;
	public String GeocodeAccuracy;
	public Integer GrossVehicleWeight;
	public Id Id;
	public Boolean IsBasementIncluded;
	public Boolean IsChimneyIncluded;
	public Boolean IsPassedSmogCheck;
	public Boolean IsSwimmingPoolIncluded;
	public Decimal KitchenCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Integer LeasePeriod;
	public String LienHolderName;
	public String LoadCapacity;
	public Decimal Longitude;
	public String LotArea;
	public String Make;
	public Integer MakeYear;
	public Integer MilesDrivenToWork;
	public String ModelName;
	public String Name;
	public Integer OdometerReading;
	public Id OwnerId;
	public User Owner;
	public Integer PassengerSeatCapacity;
	public String PostalCode;
	public Id PrimaryOwnerId;
	public Account PrimaryOwner;
	public String PrimaryUse;
	public Date PurchaseDate;
	public Decimal PurchasePrice;
	public String RegistrationNumber;
	public String RegistrationType;
	public String ReplayId;
	public String RoofType;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String State;
	public String StateCode;
	public String Street;
	public String TransmissionType;
	public String Vin;
	public Integer YearBuilt;

	public CustomerPropertyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomerPropertyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomerPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomerPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomerPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
