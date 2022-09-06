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
public class Location extends SObject {
	public static SObjectType$<Location> SObjectType;
	public static SObjectFields$<Location> Fields;

	public Date CloseDate;
	public Date ConstructionEndDate;
	public Date ConstructionStartDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DrivingDirections;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInventoryLocation;
	public Boolean IsMobile;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Location Location;
	public Integer LocationLevel;
	public String LocationType;
	public Id LogoId;
	public ContentAsset Logo;
	public Decimal Longitude;
	public String Name;
	public Date OpenDate;
	public Id OwnerId;
	public Name Owner;
	public Id ParentLocationId;
	public Location ParentLocation;
	public Date PossessionDate;
	public Date RemodelEndDate;
	public Date RemodelStartDate;
	public Id RootLocationId;
	public Location RootLocation;
	public Boolean ShouldSyncWithOci;
	public Datetime SystemModstamp;
	public String TimeZone;
	public Id VisitorAddressId;
	public Address VisitorAddress;

	public ActivityHistory[] ActivityHistories;
	public Address[] Addresses;
	public Entitlement[] AssetWarranties;
	public Asset[] Assets;
	public AssociatedLocation[] AssociatedLocations;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Location[] ChildLocations;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public Shipment[] DestinationLocationShipments;
	public ProductRequestLineItem[] DestinationProductRequestLineItems;
	public ProductRequest[] DestinationProductRequests;
	public ProductTransfer[] DestinationProductTransfers;
	public ReturnOrderLineItem[] DestinationReturnOrderLineItems;
	public ReturnOrder[] DestinationReturnOrders;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LocationFeed[] Feeds;
	public LocationHistory[] Histories;
	public LocationGroupAssignment[] Locations;
	public MaintenancePlan[] MaintenancePlans;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductItem[] ProductItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ResourcePreference[] ResourcePreferences;
	public ServiceResource[] ServiceResources;
	public ServiceTerritoryLocation[] ServiceTerritories;
	public LocationShare[] Shares;
	public Shipment[] SourceLocationShipments;
	public ProductRequestLineItem[] SourceProductRequestLineItems;
	public ProductRequest[] SourceProductRequests;
	public ProductTransfer[] SourceProductTransfers;
	public ReturnOrderLineItem[] SourceReturnOrderLineItems;
	public ReturnOrder[] SourceReturnOrders;
	public Task[] Tasks;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public Location clone$() {throw new java.lang.UnsupportedOperationException();}
	public Location clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Location clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Location clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Location clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
