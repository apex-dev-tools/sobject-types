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
public class ListEmail extends SObject {
	public static SObjectType$<ListEmail> SObjectType;
	public static SObjectFields$<ListEmail> Fields;

	public Id CampaignId;
	public Campaign Campaign;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FromAddress;
	public String FromName;
	public Boolean HasAttachment;
	public String HtmlBody;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedToId;
	public Name RelatedTo;
	public Datetime ScheduledDate;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;
	public String TextBody;
	public Integer TotalSent;
	public String[] ContentDocumentIds;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public OpenActivity[] OpenActivities;
	public ListEmailShare[] Shares;
	public Task[] Tasks;

	public ListEmail clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListEmail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListEmail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
