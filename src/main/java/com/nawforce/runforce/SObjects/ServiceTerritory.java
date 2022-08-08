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
public class ServiceTerritory extends SObject {
	public static SObjectType$<ServiceTerritory> SObjectType;
	public static SObjectFields$<ServiceTerritory> Fields;

	public Address Address;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public com.nawforce.runforce.System.String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public Name Owner;
	public Id ParentTerritoryId;
	public ServiceTerritory ParentTerritory;
	public com.nawforce.runforce.System.String PostalCode;
	public Id SchedulingConstraintId;
	public SchedulingConstraint SchedulingConstraint;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public Id TopLevelTerritoryId;
	public ServiceTerritory TopLevelTerritory;
	public Decimal TypicalInTerritoryTravelTime;

	public AttachedContentDocument[] AttachedContentDocuments;
	public ApptBundlePolicySvcTerr[] BundlePolicySvcTerrs;
	public ServiceTerritory[] ChildServiceTerritories;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ServiceTerritory[] DescendantTerritories;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceTerritoryFeed[] Feeds;
	public ServiceTerritoryHistory[] Histories;
	public ServiceTerritoryLocation[] Locations;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceTerritoryMember[] ServiceResources;
	public ServiceTerritoryShare[] Shares;
	public Shift[] ShiftServiceTerritories;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public ServiceTerritory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
