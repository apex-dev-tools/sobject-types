/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PublicComplaintChangeEvent extends SObject {
	public static SObjectType$<PublicComplaintChangeEvent> SObjectType;
	public static SObjectFields$<PublicComplaintChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BusinessAddress;
	public String BusinessName;
	public ChangeEventHeader ChangeEventHeader;
	public String Comments;
	public String ComplaintSubType;
	public String ComplaintType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Email;
	public String FirstName;
	public Id Id;
	public Date IncidentDate;
	public Boolean IsReporterConfidential;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public String MobileNumber;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public String ReplayId;
	public String ReporterAddress;
	public String ReporterCategory;
	public String ReporterOrganization;
	public String ResolutionSummary;
	public String Status;
	public String Subject;

	public PublicComplaintChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaintChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
