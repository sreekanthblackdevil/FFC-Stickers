/*
 * Copyright (c) WhatsApp Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.nightcoder.ffcstickers;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

class StickerPackListItemViewHolder extends RecyclerView.ViewHolder {

    final View container;
    final TextView titleView;
    final TextView publisherView;
    final TextView filesizeView;
    final ImageButton addButton;
    final LinearLayout imageRowView;
    final CircleImageView trayIcon;
    final LinearLayout addButtonCon, shareButton, favButton;
    final TextView addCount, favCount, shareCount;

    StickerPackListItemViewHolder(final View itemView) {
        super(itemView);
        container = itemView;
        titleView = itemView.findViewById(R.id.sticker_pack_title);
        publisherView = itemView.findViewById(R.id.sticker_pack_publisher);
        filesizeView = itemView.findViewById(R.id.sticker_pack_filesize);
        addButton = itemView.findViewById(R.id.add_button_on_list);
        imageRowView = itemView.findViewById(R.id.sticker_packs_list_item_image_list);
        trayIcon = itemView.findViewById(R.id.tray_icon);
        addButtonCon = itemView.findViewById(R.id.add_con);
        addCount = itemView.findViewById(R.id.add_count);
        favCount = itemView.findViewById(R.id.fave_count);
        shareCount = itemView.findViewById(R.id.share_count);
        shareButton = itemView.findViewById(R.id.share_con);
        favButton = itemView.findViewById(R.id.fav_con);
    }
}