/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IncidentChangeEvent extends SObject {
	public static SObjectType$<IncidentChangeEvent> SObjectType;
	public static SObjectFields$<IncidentChangeEvent> Fields;

	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DetectedDateTime;
	public Datetime EndDateTime;
	public Id EntitlementId;
	public Entitlement Entitlement;
	public Id Id;
	public String Impact;
	public String IncidentNumber;
	public Boolean IsClosed;
	public Boolean IsMajorIncident;
	public Boolean IsStopped;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Id ParentIncidentId;
	public Incident ParentIncident;
	public String Priority;
	public String PriorityOverrideReason;
	public String ReplayId;
	public String ReportedMethod;
	public Datetime ResolutionDateTime;
	public String ResolutionSummary;
	public Id ResolvedById;
	public User ResolvedBy;
	public Datetime SlaExitDate;
	public Datetime SlaStartDate;
	public Datetime StartDateTime;
	public String Status;
	public Datetime StopStartDate;
	public String SubCategory;
	public String Subject;
	public String Type;
	public String Urgency;

	public IncidentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IncidentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IncidentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IncidentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IncidentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
