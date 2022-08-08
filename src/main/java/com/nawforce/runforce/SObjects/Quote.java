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
public class Quote extends SObject {
	public static SObjectType$<Quote> SObjectType;
	public static SObjectFields$<Quote> Fields;

	public Id AccountId;
	public Account Account;
	public Address AdditionalAddress;
	public com.nawforce.runforce.System.String AdditionalCity;
	public com.nawforce.runforce.System.String AdditionalCountry;
	public com.nawforce.runforce.System.String AdditionalCountryCode;
	public com.nawforce.runforce.System.String AdditionalGeocodeAccuracy;
	public Decimal AdditionalLatitude;
	public Decimal AdditionalLongitude;
	public com.nawforce.runforce.System.String AdditionalName;
	public com.nawforce.runforce.System.String AdditionalPostalCode;
	public com.nawforce.runforce.System.String AdditionalState;
	public com.nawforce.runforce.System.String AdditionalStateCode;
	public com.nawforce.runforce.System.String AdditionalStreet;
	public Address BillingAddress;
	public com.nawforce.runforce.System.String BillingCity;
	public com.nawforce.runforce.System.String BillingCountry;
	public com.nawforce.runforce.System.String BillingCountryCode;
	public com.nawforce.runforce.System.String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public com.nawforce.runforce.System.String BillingName;
	public com.nawforce.runforce.System.String BillingPostalCode;
	public com.nawforce.runforce.System.String BillingState;
	public com.nawforce.runforce.System.String BillingStateCode;
	public com.nawforce.runforce.System.String BillingStreet;
	public com.nawforce.runforce.System.Boolean CanCreateQuoteLineItems;
	public Id ContactId;
	public Contact Contact;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Decimal Discount;
	public com.nawforce.runforce.System.String Email;
	public Date ExpirationDate;
	public com.nawforce.runforce.System.String Fax;
	public Decimal GrandTotal;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsSyncing;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.Integer LineItemCount;
	public com.nawforce.runforce.System.String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String Phone;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public com.nawforce.runforce.System.String QuoteNumber;
	public Address QuoteToAddress;
	public com.nawforce.runforce.System.String QuoteToCity;
	public com.nawforce.runforce.System.String QuoteToCountry;
	public com.nawforce.runforce.System.String QuoteToCountryCode;
	public com.nawforce.runforce.System.String QuoteToGeocodeAccuracy;
	public Decimal QuoteToLatitude;
	public Decimal QuoteToLongitude;
	public com.nawforce.runforce.System.String QuoteToName;
	public com.nawforce.runforce.System.String QuoteToPostalCode;
	public com.nawforce.runforce.System.String QuoteToState;
	public com.nawforce.runforce.System.String QuoteToStateCode;
	public com.nawforce.runforce.System.String QuoteToStreet;
	public Address ShippingAddress;
	public com.nawforce.runforce.System.String ShippingCity;
	public com.nawforce.runforce.System.String ShippingCountry;
	public com.nawforce.runforce.System.String ShippingCountryCode;
	public com.nawforce.runforce.System.String ShippingGeocodeAccuracy;
	public Decimal ShippingHandling;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public com.nawforce.runforce.System.String ShippingName;
	public com.nawforce.runforce.System.String ShippingPostalCode;
	public com.nawforce.runforce.System.String ShippingState;
	public com.nawforce.runforce.System.String ShippingStateCode;
	public com.nawforce.runforce.System.String ShippingStreet;
	public com.nawforce.runforce.System.String Status;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal Tax;
	public Decimal TotalPrice;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public QuoteFeed[] Feeds;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public QuoteDocument[] QuoteDocuments;
	public QuoteLineItem[] QuoteLineItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public QuoteShare[] Shares;
	public Task[] Tasks;

	public Quote clone$() {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
