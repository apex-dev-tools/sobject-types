/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public Id RelatedToId;
	public SObject RelatedTo;
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
