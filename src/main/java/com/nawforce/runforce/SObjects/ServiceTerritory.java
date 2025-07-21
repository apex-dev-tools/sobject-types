/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceTerritory extends SObject {
	public static SObjectType$<ServiceTerritory> SObjectType;
	public static SObjectFields$<ServiceTerritory> Fields;

	public Address Address;
	public Integer AvgTravelTime;
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
	public String SelfCheckInUrl;
	public String ServiceAppointmentLimitType;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public Id TopLevelTerritoryId;
	public ServiceTerritory TopLevelTerritory;
	public Id TravelModeId;
	public TravelMode TravelMode;
	public Integer TravelTimeBuffer;
	public Decimal TypicalInTerritoryTravelTime;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public ApptBundlePolicySvcTerr[] BundlePolicySvcTerrs;
	public CareProgramEnrollee[] CPEServiceTerritory;
	public ServiceTerritory[] ChildServiceTerritories;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ServiceTerritory[] DescendantTerritories;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceTerritoryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GeolocationBasedAction[] GeolocationBasedActions;
	public ServiceTerritoryHistory[] Histories;
	public ServiceTerritoryLocation[] Locations;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public SchedulingWorkspaceTerritory[] SchedulingWorkspaceTerritories;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceTerritoryMember[] ServiceResources;
	public ServiceTerritoryWorkType[] ServiceTerritories;
	public Waitlist[] ServiceTerritoryWaitlist;
	public ServiceTerritoryShare[] Shares;
	public Shift[] ShiftServiceTerritories;
	public TopicAssignment[] TopicAssignments;
	public WorkCapacityAvailability[] WorkCapacityAvailabilities;
	public WorkCapacityLimit[] WorkCapacityLimits;
	public WorkCapacityUsage[] WorkCapacityUsages;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public ServiceTerritory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
