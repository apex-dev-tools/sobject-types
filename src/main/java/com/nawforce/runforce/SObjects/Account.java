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
public class Account extends SObject {
	public static SObjectType$<Account> SObjectType;
	public static SObjectFields$<Account> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public com.nawforce.runforce.System.String AccountNumber;
	public com.nawforce.runforce.System.String AccountSource;
	public Decimal AnnualRevenue;
	public Address BillingAddress;
	public com.nawforce.runforce.System.String BillingCity;
	public com.nawforce.runforce.System.String BillingCountry;
	public com.nawforce.runforce.System.String BillingCountryCode;
	public com.nawforce.runforce.System.String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public com.nawforce.runforce.System.String BillingPostalCode;
	public com.nawforce.runforce.System.String BillingState;
	public com.nawforce.runforce.System.String BillingStateCode;
	public com.nawforce.runforce.System.String BillingStreet;
	public com.nawforce.runforce.System.String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DunsNumber;
	public com.nawforce.runforce.System.String Fax;
	public Id Id;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String Jigsaw;
	public com.nawforce.runforce.System.String JigsawCompanyId;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MasterRecordId;
	public Account MasterRecord;
	public com.nawforce.runforce.System.String NaicsCode;
	public com.nawforce.runforce.System.String NaicsDesc;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Ownership;
	public Id ParentId;
	public Account Parent;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PhotoUrl;
	public com.nawforce.runforce.System.String Rating;
	public Address ShippingAddress;
	public com.nawforce.runforce.System.String ShippingCity;
	public com.nawforce.runforce.System.String ShippingCountry;
	public com.nawforce.runforce.System.String ShippingCountryCode;
	public com.nawforce.runforce.System.String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public com.nawforce.runforce.System.String ShippingPostalCode;
	public com.nawforce.runforce.System.String ShippingState;
	public com.nawforce.runforce.System.String ShippingStateCode;
	public com.nawforce.runforce.System.String ShippingStreet;
	public com.nawforce.runforce.System.String Sic;
	public com.nawforce.runforce.System.String SicDesc;
	public com.nawforce.runforce.System.String Site;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TickerSymbol;
	public com.nawforce.runforce.System.String Tradestyle;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.String Website;
	public com.nawforce.runforce.System.String YearStarted;

	public AccountCleanInfo[] AccountCleanInfos;
	public AccountContactRole[] AccountContactRoles;
	public AccountPartner[] AccountPartnersFrom;
	public AccountPartner[] AccountPartnersTo;
	public AccountUserTerritory2View[] AccountUserTerritory2Views;
	public ActivityHistory[] ActivityHistories;
	public AlternativePaymentMethod[] AlternativePaymentMethods;
	public Asset[] Assets;
	public AssociatedLocation[] AssociatedLocations;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public CardPaymentMethod[] CardPaymentMethods;
	public Case[] Cases;
	public Account[] ChildAccounts;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointAddress[] ContactPointAddresses;
	public ContactPointEmail[] ContactPointEmails;
	public ContactPointPhone[] ContactPointPhones;
	public ContactRequest[] ContactRequests;
	public Contact[] Contacts;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Contract[] Contracts;
	public CreditMemo[] CreditMemos;
	public DigitalWallet[] DigitalWallets;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessage[] Emails;
	public Event[] Events;
	public Expense[] Expenses;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AccountFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public AccountHistory[] Histories;
	public Invoice[] Invoices;
	public MaintenancePlan[] MaintenancePlans;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ObjectTerritory2Association[] ObjectTerritory2Associations;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public OpportunityPartner[] OpportunityPartnersTo;
	public Order[] Orders;
	public Partner[] PartnersFrom;
	public Partner[] PartnersTo;
	public PaymentAuthAdjustment[] PaymentAuthAdjustments;
	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentLineInvoice[] PaymentLinesInvoice;
	public Payment[] Payments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public Asset[] ProvidedAssets;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public RefundLinePayment[] RefundLinePayments;
	public Refund[] Refunds;
	public AuthorizationFormConsent[] RelatedAuthorizationFormConsents;
	public WorkFeedbackRequest[] RelatedObjects;
	public ResourcePreference[] ResourcePreferences;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointmentAccount;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceResource[] ServiceResources;
	public Asset[] ServicedAssets;
	public AccountShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public User[] Users;
	public WorkOrder[] WorkOrders;

	public Account clone$() {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
