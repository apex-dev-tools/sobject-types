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
public class Address extends SObject {
	public static SObjectType$<Address> SObjectType;
	public static SObjectFields$<Address> Fields;

	public Address Address;
	public String AddressType;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DrivingDirections;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public String LocationType;
	public Decimal Longitude;
	public String Name;
	public Id ParentId;
	public Location Parent;
	public String PostalCode;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String TimeZone;

	public AuthApplicationPlace[] AuthApplPlace;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public MedicationTherapyReview[] MedTherapyReview_SurrogateLocations;
	public Visit[] Places;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public Visit[] VisitAddress;

	public Address clone$() {throw new java.lang.UnsupportedOperationException();}
	public Address clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Address clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Address clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Address clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
