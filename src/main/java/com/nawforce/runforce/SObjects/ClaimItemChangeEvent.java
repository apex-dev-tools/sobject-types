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
public class ClaimItemChangeEvent extends SObject {
	public static SObjectType$<ClaimItemChangeEvent> SObjectType;
	public static SObjectFields$<ClaimItemChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
	public Id ClaimId;
	public Claim Claim;
	public String ClaimInstanceIdentifier;
	public Id ClaimParticipantId;
	public ClaimParticipant ClaimParticipant;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Address CurrentAddress;
	public String CurrentCity;
	public String CurrentCountry;
	public String CurrentCountryCode;
	public String CurrentGeocodeAccuracy;
	public Decimal CurrentLatitude;
	public Decimal CurrentLongitude;
	public String CurrentPostalCode;
	public String CurrentState;
	public String CurrentStateCode;
	public String CurrentStreet;
	public String Description;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ProductId;
	public Product2 Product;
	public String ReplayId;

	public ClaimItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
