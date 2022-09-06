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
public class ListEmailChangeEvent extends SObject {
	public static SObjectType$<ListEmailChangeEvent> SObjectType;
	public static SObjectFields$<ListEmailChangeEvent> Fields;

	public Id CampaignId;
	public Campaign Campaign;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FromAddress;
	public String FromName;
	public Boolean HasAttachment;
	public String HtmlBody;
	public Id Id;
	public Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Datetime ScheduledDate;
	public String Status;
	public String Subject;
	public String TextBody;
	public Integer TotalSent;

	public ListEmailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListEmailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
