/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Prospect extends SObject {
	public static SObjectType$<Prospect> SObjectType;
	public static SObjectFields$<Prospect> Fields;

	public Address Address;
	public Decimal AnnualRevenue;
	public String City;
	public String Company;
	public Id ConvertedAccountId;
	public Account ConvertedAccount;
	public Id ConvertedContactId;
	public Contact ConvertedContact;
	public Date ConvertedDate;
	public Id ConvertedLeadId;
	public Lead ConvertedLead;
	public Id ConvertedOpportunityId;
	public Opportunity ConvertedOpportunity;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Email;
	public String FirstName;
	public String GenderIdentity;
	public String GeocodeAccuracy;
	public Id Id;
	public String Industry;
	public Boolean IsConverted;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Decimal Latitude;
	public String LeadSource;
	public Decimal Longitude;
	public String Name;
	public Integer NumberOfEmployees;
	public String Phone;
	public String PostalCode;
	public String ProspectRecordName;
	public String ProspectStatus;
	public String Salutation;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String Title;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public Prospect clone$() {throw new java.lang.UnsupportedOperationException();}
	public Prospect clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Prospect clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Prospect clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Prospect clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
