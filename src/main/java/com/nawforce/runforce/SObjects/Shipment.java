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
public class Shipment extends SObject {
	public static SObjectType$<Shipment> SObjectType;
	public static SObjectFields$<Shipment> Fields;

	public Datetime ActualDeliveryDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id DeliveredToId;
	public Name DeliveredTo;
	public com.nawforce.runforce.System.String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedDeliveryDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String Provider;
	public Address ShipFromAddress;
	public com.nawforce.runforce.System.String ShipFromCity;
	public com.nawforce.runforce.System.String ShipFromCountry;
	public com.nawforce.runforce.System.String ShipFromCountryCode;
	public com.nawforce.runforce.System.String ShipFromGeocodeAccuracy;
	public Decimal ShipFromLatitude;
	public Decimal ShipFromLongitude;
	public com.nawforce.runforce.System.String ShipFromPostalCode;
	public com.nawforce.runforce.System.String ShipFromState;
	public com.nawforce.runforce.System.String ShipFromStateCode;
	public com.nawforce.runforce.System.String ShipFromStreet;
	public Address ShipToAddress;
	public com.nawforce.runforce.System.String ShipToCity;
	public com.nawforce.runforce.System.String ShipToCountry;
	public com.nawforce.runforce.System.String ShipToCountryCode;
	public com.nawforce.runforce.System.String ShipToGeocodeAccuracy;
	public Decimal ShipToLatitude;
	public Decimal ShipToLongitude;
	public com.nawforce.runforce.System.String ShipToName;
	public com.nawforce.runforce.System.String ShipToPostalCode;
	public com.nawforce.runforce.System.String ShipToState;
	public com.nawforce.runforce.System.String ShipToStateCode;
	public com.nawforce.runforce.System.String ShipToStreet;
	public com.nawforce.runforce.System.String ShipmentNumber;
	public Id SourceLocationId;
	public Location SourceLocation;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public Decimal TotalItemsQuantity;
	public com.nawforce.runforce.System.String TrackingNumber;
	public com.nawforce.runforce.System.String TrackingUrl;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ShipmentFeed[] Feeds;
	public ShipmentHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ShipmentShare[] Shares;
	public ShipmentItem[] ShipmentItems;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Shipment clone$() {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Shipment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
