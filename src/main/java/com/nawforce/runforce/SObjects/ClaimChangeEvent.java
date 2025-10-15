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
public class ClaimChangeEvent extends SObject {
	public static SObjectType$<ClaimChangeEvent> SObjectType;
	public static SObjectFields$<ClaimChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualAmount;
	public Decimal ApprovedAmount;
	public Datetime AssessmentDate;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public String ClaimReason;
	public String ClaimReasonType;
	public String ClaimType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EstimatedAmount;
	public Datetime FinalizedDate;
	public String FinancialAuthorityStatus;
	public String FnolChannel;
	public Id Id;
	public Id IncidentId;
	public Incident Incident;
	public Address IncidentSite;
	public String IncidentSiteCity;
	public String IncidentSiteCountry;
	public String IncidentSiteCountryCode;
	public String IncidentSiteGeocodeAccuracy;
	public Decimal IncidentSiteLatitude;
	public Decimal IncidentSiteLongitude;
	public String IncidentSitePostalCode;
	public String IncidentSiteState;
	public String IncidentSiteStateCode;
	public String IncidentSiteStreet;
	public Datetime InitiationDate;
	public Id InsuredAssetId;
	public InsurancePolicyAsset InsuredAsset;
	public Boolean IsAuthoritiesNotified;
	public Boolean IsClosed;
	public Boolean IsDrivable;
	public Boolean IsInhabitable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LossDate;
	public String LossType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PolicyNumberId;
	public InsurancePolicy PolicyNumber;
	public Id ProductId;
	public Product2 Product;
	public String RenewalChannel;
	public String RepairShop;
	public String RepairShopLocation;
	public String ReplayId;
	public Datetime ReportDate;
	public String ReportNumber;
	public String ReportingAuthority;
	public String Severity;
	public Id SourceId;
	public SObject Source;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String Summary;
	public String UsageType;
	public Datetime VisitDate;
	public String VisitSite;

	public ClaimChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
