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
public class Quote extends SObject {
	public static SObjectType$<Quote> SObjectType;
	public static SObjectFields$<Quote> Fields;

	public Id AccountId;
	public Account Account;
	public Address AdditionalAddress;
	public String AdditionalCity;
	public String AdditionalCountry;
	public String AdditionalCountryCode;
	public String AdditionalGeocodeAccuracy;
	public Decimal AdditionalLatitude;
	public Decimal AdditionalLongitude;
	public String AdditionalName;
	public String AdditionalPostalCode;
	public String AdditionalState;
	public String AdditionalStateCode;
	public String AdditionalStreet;
	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingCountryCode;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingName;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStateCode;
	public String BillingStreet;
	public Boolean CanCreateQuoteLineItems;
	public Id ContactId;
	public Contact Contact;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public String Email;
	public Date ExpirationDate;
	public String Fax;
	public Decimal GrandTotal;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSyncing;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LineItemCount;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public Name Owner;
	public String Phone;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public String QuoteNumber;
	public Address QuoteToAddress;
	public String QuoteToCity;
	public String QuoteToCountry;
	public String QuoteToCountryCode;
	public String QuoteToGeocodeAccuracy;
	public Decimal QuoteToLatitude;
	public Decimal QuoteToLongitude;
	public String QuoteToName;
	public String QuoteToPostalCode;
	public String QuoteToState;
	public String QuoteToStateCode;
	public String QuoteToStreet;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingHandling;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingName;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String Status;
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
	public Order[] Orders;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public QuoteDocument[] QuoteDocuments;
	public QuoteLineItem[] QuoteLineItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public QuoteShare[] Shares;
	public Task[] Tasks;

	public Quote clone$() {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Quote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
