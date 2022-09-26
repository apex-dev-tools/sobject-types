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
public class ServiceTerritory extends SObject {
	public static SObjectType$<ServiceTerritory> SObjectType;
	public static SObjectFields$<ServiceTerritory> Fields;

	public Address Address;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public Name Owner;
	public Id ParentTerritoryId;
	public ServiceTerritory ParentTerritory;
	public String PostalCode;
	public Id SchedulingConstraintId;
	public SchedulingConstraint SchedulingConstraint;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public Id TopLevelTerritoryId;
	public ServiceTerritory TopLevelTerritory;
	public Id TravelModeId;
	public TravelMode TravelMode;
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
	public NetworkActivityAudit[] ParentEntities;
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
	public ServiceTerritory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
